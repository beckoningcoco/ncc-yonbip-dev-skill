# |<<

**岗位监督 (om_postsuperv / nc.vo.om.post.PostSupervVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位监督信息 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_supervtype | 监督类型 | pk_supervtype | varchar(20) | √ | 监督类型(自定义档案) (Defdoc-HRJF004_0xx) |
| 6 | workdegree | 监督工作和程度 | workdegree | varchar(200) |  | 字符串 (String) |
| 7 | supervrelapost | 涉及岗位 | supervrelapost | varchar(1000) |  | 字符串 (String) |
| 8 | supervmemo | 备注 | supervmemo | varchar(1000) |  | 字符串 (String) |