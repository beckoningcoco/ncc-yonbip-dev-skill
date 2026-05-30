# |<<

**岗前培训 (om_postbeftrain / nc.vo.om.post.PostBeftrainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3953.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗前培训主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_trianitem | 培训项目 | pk_trianitem | char(20) | √ | 主键 (UFID) |
| 6 | triantime | 培训时间 | triantime | decimal(16, 2) |  | 数值 (UFDouble) |
| 7 | triancont | 培训内容 | triancont | varchar(256) |  | 字符串 (String) |