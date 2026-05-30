# |<<

**计量指标 (pm_measureindex / nc.vo.pmbd.measureindex.MeasureIndexVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measureindex | 计量指标主键 | pk_measureindex | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 指标编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 指标名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |