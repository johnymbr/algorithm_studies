
#[derive(Debug)]
pub struct Node<T> {
    pub key: String,
    pub value: T,
    pub next: Option<Box<Node<T>>>
}

impl<T> Node<T> {
    pub fn new(key: String, value: T) -> Node<T> {
        Node { 
            key, 
            value, 
            next: None 
        }
    }

    pub fn new_with_next(key: String, value: T, next: Option<Box<Node<T>>>) -> Node<T> {
        Node {
            key,
            value,
            next
        }
    }
}

#[derive(Debug)]
pub struct MyLinkedList<T> {
    pub root: Option<Node<T>>
}

impl<T> MyLinkedList<T> {
    pub fn new() -> MyLinkedList<T> {
        MyLinkedList {
            root: None
        }
    }

    pub fn add_node(mut self, key: String, value: T) {
        if let None = self.root {
            let root = Node::new(key, value);
            self.root = Some(root);
        } else {
            let mut last_node = self.root.unwrap();
            while let Some(inner_node) = last_node.next {
                last_node = *inner_node;
            }

            last_node.next = Some(Box::new(Node::new(key, value)));
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn new_node() {
        let node = Node::<i32>::new(String::from("x"), 10);
        assert!(node.next.is_none());
    }

    #[test]
    fn new_node_with_next() {
        let next = Node::<i32>::new(String::from("x"), 2);
        let node = Node::<i32>::new_with_next(String::from("z"), 3, Some(Box::new(next)));

        assert!(node.next.is_some());
        assert_eq!(2, node.next.unwrap().value);
    }
}