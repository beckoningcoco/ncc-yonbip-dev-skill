# |<<

**特征类 (bd_fclass / nc.vo.bd.feature.fclass.entity.FclassHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfeatureclsid | 特征类 | cfeatureclsid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vfeatureclscode | 特征类编码 | vfeatureclscode | varchar(20) |  | 字符串 (String) |
| 4 | vfeatureclsname | 特征类名称 | vfeatureclsname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | fenable | 启用状态 | fenable | int |  | 启用状态 (enablestatus) |  | 0=已启用; |