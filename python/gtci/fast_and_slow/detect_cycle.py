from __future__ import print_function
from linked_list import LinkedList
from print_list import print_list_with_forward_arrow


def detect_cycle(head):
    slow, fast = head, head
    i, j = 0, 0
    space1, space2, last = 0, 2, 5
    print("\tHead pointer:", head.data)
    print("\tSlow pointer:", slow.data)
    print("\tFast pointer:", fast.data)
    print_list_with_forward_arrow(head)
    print("\n\t", "  "*((6*i)) + "ŝf̂")
    # Run the loop until we reach the end of the
    # linked list or find a cycle
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        last -= 2

        print("\n\tLoop index:", i)
        i += 1
        j += 2
        # Break the loop if fast pointer has reached at
        # the end of linked list
        if fast is None:
            print("\tSlow pointer:", slow.data)
            print("\tFast pointer: NULL")
            print("\tFast pointer has reached the end"
                  " of the linked list.")
            break
        else:
            print("\tSlow pointer:", slow.data)
            print("\tFast pointer:", fast.data, "\n")
            print_list_with_forward_arrow(head)
        if slow == fast:
            print("\n\t", " "*((6*i-5)), "ŝf̂", sep=" ")
            print("\tBoth slow and fast pointers are pointing"
                  " to the same node!")
            return True
        else:
            if last == -1:
                print("\n\t", " "*((6*(space2-1))-((6*space1)-1)-3),
                      " f̂ast  ", " "*(((6*i)-14)), "ŝlow", sep="")
                space2 += 2
            if last == -3:
                print("\n\t", " "*((6*(space2-1))-((6*space1)-1)-5),
                      " f̂ast  ", " "*(((6*i)-12)-16), "ŝlow", sep="")
                space2 += 2
            if last > 0:
                print("\n\t", " "*(6*i-(i-1)) + "ŝlow", " "*((6*(j-1))-((6*i))),
                      " f̂ast", sep="")
    return False


def main():

    input = (
             [2, 4, 6, 8, 10, 12],
             [1, 3, 5, 7, 9, 11],
             [0, 1, 2, 3, 4, 6],
             [3, 4, 7, 9, 11, 17],
             [5, 1, 4, 9, 2, 3],
            )
    pos = [0, -1, 1, -1, 2]
    j = 1

    for i in range(len(input)):

        input_linked_list = LinkedList()
        input_linked_list.create_linked_list(input[i])
        if pos[i] != -1:
            length = input_linked_list.get_length(input_linked_list.head)
            last_node = input_linked_list.get_node(input_linked_list.head, length - 1)
            last_node.next = input_linked_list.get_node(input_linked_list.head, pos[i])

        print(f"{j}.\tInput: ")
        print_list_with_forward_arrow(input_linked_list.head)
        print("\n\tProcessing...")
        print(f"\n\tDetected cycle = {detect_cycle(input_linked_list.head)}")
        j += 1
        print("-"*100, "\n")


if __name__ == "__main__":
    main()
