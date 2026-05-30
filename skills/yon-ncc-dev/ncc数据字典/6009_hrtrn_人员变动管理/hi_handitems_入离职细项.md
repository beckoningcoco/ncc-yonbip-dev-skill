# |<<

**入离职细项 (hi_handitems / nccloud.dto.hryf.handitem.HandItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2544.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handitem | 入离职细项主键 | pk_handitem | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_itemtype | 类别 | pk_itemtype | varchar(20) |  | 交接分类(自定义档案) (Defdoc-HRYF002_0xx) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |