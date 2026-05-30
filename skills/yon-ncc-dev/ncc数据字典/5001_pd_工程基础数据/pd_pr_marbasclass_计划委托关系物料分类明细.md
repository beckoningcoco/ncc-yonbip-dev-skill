# |<<

**计划委托关系物料分类明细 (pd_pr_marbasclass / nc.vo.pd.planrelation.entity.PRMarBasClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pr_marbasclass | 计划委托关系物料分类明细 | pk_pr_marbasclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_计划中心 (plancenter) |
| 4 | pk_org_v | 计划中心 | pk_org_v | varchar(20) |  | 组织_业务单元_计划中心版本信息 (plancenter_v) |
| 5 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |