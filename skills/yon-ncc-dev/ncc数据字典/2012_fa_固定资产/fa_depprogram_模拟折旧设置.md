# |<<

**模拟折旧设置 (fa_depprogram / nc.vo.fa.depprogram.DepProgramHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depprogram | 主键 | pk_depprogram | char(20) | √ | 主键 (UFID) |
| 2 | program_code | 方案编码 | program_code | varchar(40) |  | 字符串 (String) |
| 3 | program_name | 方案名称 | program_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 5 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 折旧方法 (depmethod) |
| 6 | sim_localoriginvalue | 模拟资产原值 | sim_localoriginvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | sim_salvagerate | 模拟净残值率(%) | sim_salvagerate | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | sim_salvalue | 模拟净残值 | sim_salvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | sim_servicemonth | 模拟使用月限 | sim_servicemonth | int |  | 整数 (Integer) |
| 10 | sim_predevaluaterate | 模拟减值准备(本币原值%) | sim_predevaluaterate | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | sim_predevaluate | 模拟减值准备 | sim_predevaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | sim_accudep | 模拟累计折旧 | sim_accudep | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 15 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 16 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |