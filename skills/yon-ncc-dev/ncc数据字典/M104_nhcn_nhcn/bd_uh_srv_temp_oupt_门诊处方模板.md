# |<<

**门诊处方模板 (bd_uh_srv_temp_oupt / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcTempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1132.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtemp_oupt | 模板主键 | pk_srvtemp_oupt | char(20) | √ | 主键 (UFID) |
| 2 | code | 模板编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 模板名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | eu_right | 模板使用范围 | eu_right | int |  | 整数 (Integer) |
| 7 | pk_dept | 使用科室 | pk_dept | varchar(50) |  | 字符串 (String) |
| 8 | pk_psn | 使用人员 | pk_psn | varchar(50) |  | 字符串 (String) |
| 9 | pk_diag | 适用疾病 | pk_diag | varchar(50) |  | 字符串 (String) |
| 10 | pk_father | 上级模板主键 | pk_father | varchar(50) |  | 字符串 (String) |
| 11 | mould_type | 模板类型 | mould_type | int |  | 模板类型 (enum) |  | 0=西药/中成药; |