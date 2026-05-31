# |<<

**组织_业务单元_库存组织版本信息 (org_stockorg_v / nc.vo.vorg.StockOrgVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4179.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_stockorg | 库存组织主键 | pk_stockorg | char(0) | √ | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_financeorg | 所属财务组织 | pk_financeorg | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 4 | code | 库存组织编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 库存组织名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | addressbook | 地址 | addressbook | varchar(20) |  | 地址簿 (address) |
| 7 | pk_address | 所在地点 | pk_address | varchar(20) |  | 地点档案 (addressdoc) |
| 8 | pk_areacl | 所属地区 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 9 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |