# |<<

**岗位素质指标 (om_postneed / nc.vo.om.post.PostNeedVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3967.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位胜任能力主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_competencytype | 素质指标类型 | pk_competencytype | varchar(20) | √ | 能力素质指标类别 (CompetencyindexType) |
| 6 | pk_competency_h | 素质指标 | pk_competency_h | varchar(20) | √ | 能力素质指标 (Competencyindex) |
| 7 | pk_competency_b | 要求级别 | pk_competency_b | varchar(20) | √ | 能力素质指标等级 (CompetencyindexGrade) |
| 8 | levelremark | 级别说明 | levelremark | varchar(200) |  | 字符串 (String) |
| 9 | iindex | 排列序号 | iindex | int |  | 整数 (Integer) |
| 10 | weight | 权重 | weight | decimal(28, 2) |  | 数值 (UFDouble) |