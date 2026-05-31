# |<<

**医保计划单病种控制 (bd_uh_hp_dise / com.yonyou.yh.nhis.bd.healthplan.vo.HPDiseaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1033.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpdise | 医保计划费用控制主键 | pk_hpdise | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 5 | pk_diag | 疾病编码 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | amt_price | 疾病金额限制 | amt_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |