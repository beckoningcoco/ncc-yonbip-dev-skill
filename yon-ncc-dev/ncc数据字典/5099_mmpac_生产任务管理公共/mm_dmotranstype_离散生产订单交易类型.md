# |<<

**离散生产订单交易类型 (mm_dmotranstype / nc.vo.mmpac.dmo.entity.transtype.DmoTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3668.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dmotranstype | 离散生产订单交易类型主键 | pk_dmotranstype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型主键 | ctrantypeid | char(20) |  | 主键 (UFID) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bautofinish | 生产订单自动完成 | bautofinish | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | fpickmauditmode | 备料计划审核方式 | fpickmauditmode | int |  | 备料计划审核方式 (PickmAuditModeEnum) | 2 | 1=离散生产订单投放时自动审批; |