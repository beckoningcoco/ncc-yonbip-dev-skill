# |<<

**发票应用设置 (bd_uh_invcate_argu / nc.vo.nhis.bd.invcateargu.vo.InvCateArguVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcateargu | 主键 | pk_invcateargu | char(20) | √ | 主键 (UFID) |
| 2 | pk_invcate | 发票分类 | pk_invcate | varchar(50) |  | 字符串 (String) |
| 3 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) | √ | 就诊类型 (pvtype) |
| 4 | pk_paticate | 患者分类 | pk_paticate | varchar(20) | √ | 患者分类 (paticate) |
| 5 | pk_hp | 付款计划 | pk_hp | varchar(20) | √ | 医保计划 (healthplan) |
| 6 | modifiedtiem | 修改时间 | modifiedtiem | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |