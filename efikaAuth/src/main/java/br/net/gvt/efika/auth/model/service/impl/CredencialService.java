/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.auth.model.service.impl;

import br.net.gvt.efika.auth.rest.request.VerificarCredencialRequest;

/**
 *
 * @author G0042204
 */
public interface CredencialService {

    public Boolean verificar(VerificarCredencialRequest cred) throws Exception;

}
