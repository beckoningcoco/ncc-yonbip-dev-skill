# |<<

**客户费用申请交易类型 (me_m4641trantype / nc.vo.me.m4641trantype.entity.M4641TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3614.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 客户费用申请交易类型 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | browcloseflag | 默认核报一次行关闭 | browcloseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | ioverapplyratio | 超申请比例% | ioverapplyratio | int |  | 整数 (Integer) | 0 |