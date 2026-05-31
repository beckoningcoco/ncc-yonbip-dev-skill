# |<<

**患者就诊_住院属性_新生儿 (uh_pv_ip_newborn / com.yonyou.yh.nhis.pv.pvipnewborn.vo.PvIpNewbornVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6237.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvipnewborn | 新生儿主键 | pk_pvipnewborn | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pv_mother | 新生儿母亲 | pk_pv_mother | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | sortno | 新生儿序号 | sortno | int |  | 整数 (Integer) |
| 6 | code_newborn | 新生儿编码 | code_newborn | varchar(30) |  | 字符串 (String) |
| 7 | name_newborn | 新生儿名称 | name_newborn | varchar(50) |  | 字符串 (String) |
| 8 | pk_sex | 性别 | pk_sex | varchar(20) |  | 性别(自定义档案) (Defdoc-000000) |
| 9 | dt_sex | 性别编码 | dt_sex | varchar(50) |  | 字符串 (String) |
| 10 | birthday | 出生时间 | birthday | char(19) |  | 日期时间 (UFDateTime) |
| 11 | week_preg | 孕周数 | week_preg | int |  | 整数 (Integer) |
| 12 | num_preg | 孕次数 | num_preg | int |  | 整数 (Integer) |
| 13 | num_deli | 产次数 | num_deli | int |  | 整数 (Integer) |
| 14 | mode_deli | 分娩方式 | mode_deli | int |  | 分娩方式 (mode_deli) |  | 0=自然; |