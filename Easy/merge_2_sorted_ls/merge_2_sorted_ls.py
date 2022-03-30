# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        # create a dummy node to prevent the edge case of inserting into empty list
        dummy = ListNode()
        #create a pointer 
        tail = dummy

        #iterate while both l1 and l2 still have values
        while l1 and l2:
            #comparisons
            if l1.val > l2.val:
                tail.next = l2
                #move both pointers
                tail = tail.next
                l2 = l2.next
            else:
                tail.next = l1
                #move both pointers
                tail = tail.next
                l1 = l1.next

        #check if the arrays still have excess values, if have just append since they are sorted
        if l1:
            tail.next = l1
        if l2:
            tail.next = l2
        
        return dummy.next