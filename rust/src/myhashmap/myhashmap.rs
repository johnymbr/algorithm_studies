use super::MyLinkedList;

pub struct MyHashMap<T> {
    pub hash: Vec<MyLinkedList<T>>,
}