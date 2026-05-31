# |<<

**流程生产订单交易类型 (mm_motrantype / nc.vo.mmpac.pmo.pac0002.entity.PMOTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3699.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_motrantype | 流程生产订单交易类型 | pk_motrantype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型 | ctrantypeid | char(20) |  | 主键 (UFID) |
| 4 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 5 | bautofinish | 流程生产订单自动完成 | bautofinish | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | fpickmauditmode | 备料计划审批方式 | fpickmauditmode | int |  | 备料计划审批方式 (PMOPickmAuditModeEnum) | 2 | 1=流程生产订单投放时自动审批; |