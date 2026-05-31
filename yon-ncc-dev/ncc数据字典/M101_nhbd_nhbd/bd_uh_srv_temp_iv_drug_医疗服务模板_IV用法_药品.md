# |<<

**医疗服务模板_IV用法_药品 (bd_uh_srv_temp_iv_drug / com.yonyou.yh.nhis.bd.srvtmpl.vo.SrvTmplDrugVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pv_ivdrug | IV药品主键 | pv_ivdrug | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 5 | quan | 单次剂量 | quan | int |  | 整数 (Integer) |
| 6 | pk_role_iv | 角色主键 | pk_role_iv | varchar(20) |  | IV药角色(自定义档案) (Defdoc-030407) |
| 7 | dt_role_iv | 角色编码 | dt_role_iv | varchar(50) |  | 字符串 (String) |
| 8 | pk_srvtemp | 模板主键 | pk_srvtemp | varchar(20) |  | 服务模板基本信息 (SrvTmplVO) |