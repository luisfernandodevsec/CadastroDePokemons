-- V2: Migration to add level column in cadastro table

ALTER TABLE tb_cadastro ADD COLUMN level VARCHAR(255);