 Definition for singly-linked list.
# class ListNode(object):
# def __init__(self, x):
# self.val = x
# self.next = None
class Solution(object):
def reverseList(self, head):
"""
:type head: ListNode
:rtype: ListNode
"""
if head == None:
return None
elif head != None and head.next == None:
return head
else:
temp = None
next_node = None
while head != None:
next_node = head.next
head.next = temp
temp = head
head = next_node
return temp
