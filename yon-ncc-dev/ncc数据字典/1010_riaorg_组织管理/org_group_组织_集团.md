# |<<

**组织_集团 (org_group / nc.vo.org.GroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团主键 | pk_group | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 5 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | service | 主营业务 | service | varchar(200) |  | 字符串 (String) |
| 7 | industry | 所属行业 | industry | varchar(20) |  | 经济行业(自定义档案) (Defdoc-SYS005_0xx) |
| 8 | introduction | 简介 | introduction | varchar(500) |  | 备注 (Memo) |
| 9 | countryarea | 行政区划 | countryarea | varchar(20) |  | 行政区划 (region) |
| 10 | headaddress | 总部地址 | headaddress | varchar(20) |  | 地址簿 (address) |
| 11 | tel | 电话 | tel | varchar(60) |  | 字符串 (String) |
| 12 | fax | 传真 | fax | varchar(60) |  | 字符串 (String) |
| 13 | createdate | 成立时间 | createdate | char(19) | √ | 日期 (UFDate) |
| 14 | pk_fathergroup | 上级集团 | pk_fathergroup | varchar(20) |  | 组织_集团 (group) |
| 15 | memo | 备注 | memo | varchar(500) |  | 备注 (Memo) |
| 16 | ecotype | 经济类型 | ecotype | varchar(20) |  | 经济类型(自定义档案) (Defdoc-SYS004_0xx) |
| 17 | initflag | 初始化完成 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |