# |<<

**常用凭证的分类 (iufo_comvouch_sort / nc.vo.hbbb.commonvouch.CommonVouchSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comvouch_sort | 分类主键 | pk_comvouch_sort | char(20) | √ | 主键 (UFID) |
| 2 | name | 分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | note | 说明 | note | varchar(2000) |  | 备注 (Memo) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | vouchtype | 凭证分类 | vouchtype | varchar(50) |  | 常用凭证类别 (enum) |  | 1=常用调整凭证; |