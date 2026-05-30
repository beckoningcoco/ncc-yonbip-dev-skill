# |<<

**销售费用单类型 (so_m35trantype / nc.vo.so.m35trantype.entity.M35TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5418.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 销售费用单类型主键 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | bsubinvcustflag | 按照开票客户冲抵 | bsubinvcustflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 4 | bsubsaleorgflag | 按照销售组织冲抵 | bsubsaleorgflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 5 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 6 | fpaymentflag | 支付方式 | fpaymentflag | int |  | 支付方式 (ardeductionpaymentflag) | 1 | 1=冲抵销售金额; |