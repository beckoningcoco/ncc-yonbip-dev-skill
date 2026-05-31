# |<<

**自定义计划期间 (tb_defplanperiod / nc.vo.tb.dimdocpub.DefPlanPeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5711.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 计划期间编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 计划期间名称 | objname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | starttime | 起始时间 | starttime | char(19) |  | 日期 (UFDate) |
| 5 | endtime | 终止时间 | endtime | char(19) |  | 日期 (UFDate) |
| 6 | createddate | 创建时间 | createddate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifiedby | 最后修改人 | modifiedby | varchar(20) |  | 用户 (user) |
| 8 | modifieddate | 最后修改时间 | modifieddate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | pk_parent | 上级成员 | pk_parent | varchar(20) |  | 自定义计划期间 (tb_defplanperiod) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用停用 (enableState) | 2 | 2=已启用; |