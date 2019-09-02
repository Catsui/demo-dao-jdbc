package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1: insert ===");
		
		Department dep = new Department(null, "Music");
		
		depDao.insert(dep);
		System.out.println("Insert realizado com sucesso.");
		
		System.out.println("=== Teste 2: update ===");
		
		Department dep2 = new Department(6, "Teste update");
		depDao.update(dep2);
		
		System.out.println("=== Teste 3: deleteById ===");
		System.out.print("Id do departamento a ser excluído: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		
		System.out.println("=== Teste 4: findById ===");
		
		System.out.print("Id do departamento procurado: ");
		id = sc.nextInt();
		dep = depDao.findById(id);
		System.out.println(dep);
		
		System.out.println("=== Teste 5: findAll ===");
		
		System.out.println("Lista de departamentos existentes:");
		List<Department> list = depDao.findAll();
		
		list.forEach(System.out::println);
		
		sc.close();
	}

}
