# |<<

**拆卸单表头 (ic_teardown_h / nc.vo.ic.m4m.entity.TeardownBillHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cspecialhid | 拆卸单主键 | cspecialhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | vtrantypecode | 拆卸类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 10 | fbillflag | 单据状态 | fbillflag | int |  | 库存调整单单据状态枚举 (enum) | 1 | 1=自由; |