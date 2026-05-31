# |<<

**属性分类 (bcbd_attrclass / nc.vo.bcbd.attrclass.AttrClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/253.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attrclass | 属性分类主键 | pk_attrclass | char(20) | √ | 主键 (UFID) |
| 2 | attrclasscode | 分类编码 | attrclasscode | varchar(50) |  | 字符串 (String) |
| 3 | attrclassname | 分类名称 | attrclassname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 5 | isdefault | 是否预置数据 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |