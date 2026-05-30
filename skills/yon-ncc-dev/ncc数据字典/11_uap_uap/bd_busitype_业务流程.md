# |<<

**业务流程 (bd_busitype / nc.vo.pf.pub.BusitypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busitype | 主键 | pk_busitype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | busicode | 业务流程编码 | busicode | varchar(50) |  | 字符串 (String) |
| 4 | businame | 业务流程名称 | businame | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | busiprop | 业务流程类别 | busiprop | varchar(50) |  | 业务流程类别枚举 (BusiTypeClassVO) |  | 0=采购; |