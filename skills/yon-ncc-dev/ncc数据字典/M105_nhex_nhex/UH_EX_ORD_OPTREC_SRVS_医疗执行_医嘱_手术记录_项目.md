# |<<

**医疗执行_医嘱_手术记录_项目 (UH_EX_ORD_OPTREC_SRVS / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppOptRecSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6098.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_optrecsrvs | 手术记录项目主键 | pk_optrecsrvs | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_optrec | 手术记录 | pk_optrec | varchar(20) |  | 字符串 (String) |
| 5 | dt_optpsnrole | 角色类型编码 | dt_optpsnrole | varchar(20) |  | 字符串 (String) |
| 6 | pk_optpsnrole | 角色类型 | pk_optpsnrole | varchar(20) |  | 字符串 (String) |
| 7 | code_srv_op | 手术服务编码 | code_srv_op | varchar(20) |  | 字符串 (String) |
| 8 | eu_opsrvrole | 手术角色类型 | eu_opsrvrole | varchar(300) |  | 字符串 (String) |
| 9 | note | 备注 | note | varchar(300) |  | 字符串 (String) |
| 10 | opcode | 手术编码 | opcode | varchar(50) |  | 字符串 (String) |
| 11 | pk_diag_op | 手术 | pk_diag_op | varchar(50) |  | 字符串 (String) |
| 12 | pk_srv_op | 手术服务 | pk_srv_op | varchar(50) |  | 字符串 (String) |