# |<<

**人力资源管理_岗位序列 (om_postseries / nc.vo.org.PostSeriesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_postseries | 岗位序列主键 | pk_postseries | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(0) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | father_pk | 上级序列 | father_pk | varchar(20) |  | 人力资源管理_岗位序列 (postseries) |
| 5 | postseriescode | 岗位序列编码 | postseriescode | varchar(40) | √ | 字符串 (String) |
| 6 | postseriesname | 岗位序列名称 | postseriesname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | postseriesdesc | 岗位序列概要/描述 | postseriesdesc | varchar(1024) |  | 备注 (Memo) |
| 8 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 9 | seq | 序号 | seq | varchar(20) |  | 字符串 (String) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |