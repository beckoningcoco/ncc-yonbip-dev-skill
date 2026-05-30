# |<<

**映射规则 (sscrp_fieldmap / nc.vo.sscrp.fieldmap.FieldMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5615.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fieldmap | 主键 | pk_fieldmap | varchar(20) | √ | 主键 (UFID) |
| 2 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 3 | src_transtype | 来源交易类型 | src_transtype | varchar(50) |  | 字符串 (String) |
| 4 | frontclass | 映射前处理类 | frontclass | varchar(256) |  | 字符串 (String) |
| 5 | backclass | 映射后处理类 | backclass | varchar(256) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |