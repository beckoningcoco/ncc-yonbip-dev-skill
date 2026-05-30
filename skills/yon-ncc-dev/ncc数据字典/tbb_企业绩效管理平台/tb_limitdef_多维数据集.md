# |<<

**多维数据集 (tb_limitdef / nc.vo.tb.limit.LimitDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_cube | 所属模型 | pk_cube | varchar(20) |  | 应用模型 (tb_cube) |
| 3 | objcode | 编码 | objcode | varchar(50) | √ | 字符串 (String) |
| 4 | objname | 名称 | objname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | description | 描述 | description | varchar(500) |  | 字符串 (String) |
| 6 | createdby | 创建人 | createdby | varchar(20) |  | 用户 (user) |
| 7 | createddate | 创建日期 | createddate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifiedby | 修改人 | modifiedby | varchar(20) |  | 用户 (user) |
| 9 | modifieddate | 修改日期 | modifieddate | char(19) |  | 日期时间 (UFDateTime) |
| 10 | dimsectionsettuple | 维度集 | dimsectionsettuple | text(0) |  | BLOB (BLOB) |
| 11 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |