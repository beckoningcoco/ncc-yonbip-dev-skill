# |<<

**冲抵明细实体 (so_arsub_detail / nc.vo.so.m35.entity.ArsubDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | carsubdetailid | 冲抵明细表主键 | carsubdetailid | char(20) | √ | 主键 (UFID) |
| 2 | carsubbid | 销售费用单子表主键 | carsubbid | char(20) |  | 主键 (UFID) |
| 3 | csalebillid | 销售单据主表主键 | csalebillid | varchar(20) |  | 字符串 (String) |
| 4 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | ndetailsubmny | 金额 | ndetailsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | dsubdate | 日期 | dsubdate | char(19) |  | 日期 (UFDate) |
| 7 | csuboperator | 业务员 | csuboperator | varchar(20) |  | 用户 (user) |
| 8 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 单据类型 (BilltypeVO) |