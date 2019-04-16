package HashMap;

public class Employee {
      
      private int empId;
      private String empName;
      
      public Employee(int empId, String empName) {
            super();
            this.empId = empId;
            this.empName = empName;
      }

      /**
       * @return the empId
       */
      public int getEmpId() {
            return empId;
      }

      /**
       * @param empId the empId to set
       */
      public void setEmpId(int empId) {
            this.empId = empId;
      }

      /**
       * @return the empName
       */
      public String getEmpName() {
            return empName;
      }

      /**
       * @param empName the empName to set
       */
      public void setEmpName(String empName) {
            this.empName = empName;
      }

      /* (non-Javadoc)
       * @see java.lang.Object#toString()
       */
      @Override
      public String toString() {
            return "Employee [empId=" + empId + ", empName=" + empName + "]";
      }

      @Override
      public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + empId;
            return result;
      }

      @Override
      public boolean equals(Object obj) {
            if (this == obj)
                  return true;
            if (obj == null)
                  return false;
            if (getClass() != obj.getClass())
                  return false;
            Employee other = (Employee) obj;
            if (empId != other.empId)
                  return false;
            return true;
      }
      
      

}
