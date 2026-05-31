# |<<

**作业费率 (sca_feeprice / nc.vo.sca.costbom.entity.OperateRateVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feeprice | 作业费率主键 | pk_feeprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_costtypeid | 成本类型 | pk_costtypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 6 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 7 | relcactivityid | 关联作业 | relcactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 8 | cmarcostclassid | 物料成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 9 | pk_bd_wk | 工作中心 | pk_bd_wk | varchar(20) |  | 工作中心 (bd_wk) |
| 10 | dfeerate | 作业费率 | dfeerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | dbillratio | 计费比例 | dbillratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | effectiveperiod | 生效期间 | effectiveperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 13 | invalidperiod | 失效期间 | invalidperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 更新人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 更新时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |