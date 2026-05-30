# |<<

**岗位序列 (om_postseries / nc.vo.om.post.PostSeriesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3973.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_postseries | 岗位序列主键 | pk_postseries | char(20) | √ | 主键 (UFID) |
| 2 | postseriescode | 岗位序列编码 | postseriescode | varchar(40) |  | 字符串 (String) |
| 3 | postseriesname | 岗位序列名称 | postseriesname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | postseriesdesc | 岗位序列概要/描述 | postseriesdesc | varchar(1024) |  | 备注 (Memo) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | father_pk | 父岗位序列 | father_pk | varchar(20) |  | 岗位序列 (postseries) |
| 7 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | seq | SEQ | seq | varchar(50) |  | 字符串 (String) |
| 9 | pk_group | pk_group | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |