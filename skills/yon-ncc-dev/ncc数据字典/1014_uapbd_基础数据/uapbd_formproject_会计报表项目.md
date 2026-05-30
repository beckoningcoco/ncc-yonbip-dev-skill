# |<<

**会计报表项目 (uapbd_formproject / nc.vo.uapbd.accountingprojectsystem.FormProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formproject | 会计报表项目主键 | pk_formproject | char(20) | √ | 主键 (UFID) |
| 2 | father_pk | 上级对象 | father_pk | varchar(20) |  | 会计报表项目 (formproject) |
| 3 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 4 | pk_formprojectsystem | 会计报表体系 | pk_formprojectsystem | varchar(20) |  | 会计报表项目体系 (formprojectsystem) |
| 5 | indexno | 序号 | indexno | int |  | 整数 (Integer) |
| 6 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 11 | itemprop | 项目性质 | itemprop | varchar(50) |  | 项目性质 (itemprop) |  | 1=金额; |