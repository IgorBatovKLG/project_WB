
package com.example.project_wb.model.product;




public class Log {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Log.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
