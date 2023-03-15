# Template for printing the linked list with forward arrows

def print_list_with_forward_arrow(linked_list_node):
    temp = linked_list_node
    i = 0

    while temp and i < 7:
        if i == 0:
            print("\t", temp.data, end=" ")  # print node value
        else:
            print(temp.data, end=" ")  # print node value
        temp = temp.next
        if i == 6:
            print("(...)")
            break
        if temp:
            print("→ ", end=" ")
        else:
            # if this is the last node, print null at the end
            print("→ NULL", end=" ")
        i += 1
