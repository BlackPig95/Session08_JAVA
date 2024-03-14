package baitap.ra.business.implement;

import baitap.ra.business.config.InputMethods;
import baitap.ra.business.design.CRUD;
import baitap.ra.business.entity.Student;

public class StudentImplement implements CRUD
{
    private static Student[] students = new Student[100];
    private static int size = 0;

    @Override
    public void create()
    {
        if (size == 100)
        {
            System.err.println("mảng đầy");
        } else
        {
            // logic thêm mới
            // ta 1 đối tượng student
            Student newStudent = new Student();
            newStudent.inputData();
            // thêm vào mang
            students[size] = newStudent;
            size++; // tăng số lương
        }
    }

    @Override
    public void display()
    {
        if (size == 0)
        {
            System.err.println("mảng ko co ptu");
        } else
        {
            for (int i = 0; i < size; i++)
            {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public void edit()
    {
        if (size == 0)
        {
            System.out.println("Hiện không có học sinh nào");
            return;
        }
        int editId = searchStudentById();
        if (editId != -1)
        {
            System.out.println("Mời sửa thông tin của học sinh: " + students[editId].getStudentName());
            students[editId].inputData();
        } else
        {
            System.out.println("Không tìm thấy học sinh có mã tương ứng");
        }
    }

    @Override
    public void delete()
    {
        if (size == 0)
        {
            System.out.println("Hiện không có học sinh nào");
            return;
        }
        int deleteId = searchStudentById();
        if (deleteId != -1)
        {
            for (int i = deleteId; i < size - 1; i++)
            {
                students[i] = students[i + 1];
            }
            students[size - 1] = null;
            size--;
        } else System.out.println("Không tìm thấy học sinh");
    }

    public static int searchStudentById()
    {
        System.out.println("Nhập vào mã học sinh muốn tìm");
        int searchId = InputMethods.getInteger();
        for (int i = 0; i < size; i++)
        {
            if (students[i].studentId == searchId)
            {
                return i;
            }
        }
        return -1;
    }
}
