package com.les.bolo.view.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.les.bolo.core.dominio.EntidadeDominio;
import com.les.bolo.core.dominio.Resultado;

/**
 * interface IViewHelper
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public interface IViewHelper {
	
	public EntidadeDominio getEntidade(HttpServletRequest request);
	
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
