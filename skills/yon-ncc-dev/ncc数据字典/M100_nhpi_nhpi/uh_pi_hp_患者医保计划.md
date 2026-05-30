# |<<

**患者医保计划 (uh_pi_hp / com.yonyou.yh.nhis.pi.pati.vo.PatiHealthPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6192.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patihp | 保险计划主键 | pk_patihp | char(20) | √ | 主键 (UFID) |
| 2 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 7 | code_hp | 医保计划证件号 | code_hp | varchar(50) |  | 字符串 (String) |
| 8 | priority | 保险优先级 | priority | int |  | 整数 (Integer) |
| 9 | flag_def | 默认标识 | flag_def | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | eu_validmode | 医保计划有效方式 | eu_validmode | int |  | 医保计划有效方式 (ValidModeEnum) |  | 0=启用标志模式; |