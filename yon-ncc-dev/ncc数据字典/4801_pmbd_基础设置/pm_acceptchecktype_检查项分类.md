# |<<

**检查项分类 (pm_acceptchecktype / nc.vo.pmbd.acceptchecktype.AcceptCheckTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acchecktype | 检查项分类主键 | pk_acchecktype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | type_code | 分类编码 | type_code | varchar(200) |  | 字符串 (String) |
| 5 | type_name | 分类名称 | type_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_parent | 父分类 | pk_parent | varchar(20) |  | 检查项分类 (AcceptCheckType) |
| 7 | innercode | 内码 | innercode | varchar(200) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |