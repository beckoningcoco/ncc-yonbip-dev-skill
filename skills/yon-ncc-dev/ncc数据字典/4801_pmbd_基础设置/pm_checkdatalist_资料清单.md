# |<<

**资料清单 (pm_checkdatalist / nc.vo.pmbd.datalist.CheckDataListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkdatalist | 资料清单主键 | pk_checkdatalist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | data_list_code | 资料编码 | data_list_code | varchar(200) |  | 字符串 (String) |
| 5 | data_list_name | 资料名称 | data_list_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |