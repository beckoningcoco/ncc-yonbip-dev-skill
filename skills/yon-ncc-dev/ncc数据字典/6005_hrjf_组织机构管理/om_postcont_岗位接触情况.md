# |<<

**岗位接触情况 (om_postcont / nc.vo.om.post.PostContVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位接触情况主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 基准岗位 (poststd) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_contactobj | 接触对象 | pk_contactobj | varchar(20) | √ | 接触对象(自定义档案) (Defdoc-HRJF003_0xx) |
| 6 | contfreq | 频率 | contfreq | varchar(50) |  | 字符串 (String) |
| 7 | contmode | 方式 | contmode | varchar(50) |  | 字符串 (String) |
| 8 | contmemo | 备注 | contmemo | varchar(1000) |  | 字符串 (String) |