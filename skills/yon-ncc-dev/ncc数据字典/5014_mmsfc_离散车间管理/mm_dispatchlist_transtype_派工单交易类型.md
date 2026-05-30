# |<<

**派工单交易类型 (mm_dispatchlist_transtype / nc.vo.mmsfc.dispatchlist.entity.DispatchlistTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dispatchtranstype | 派工单交易类型 | pk_dispatchtranstype | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 字符串 (String) |
| 4 | bautoapprove | 保存即审批 | bautoapprove | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 6 | bautopickm | 派工单审批自动生成用料需求 | bautopickm | char(1) |  | 布尔类型 (UFBoolean) |