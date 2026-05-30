# |<<

**岗位工作权限 (om_postpower / nc.vo.om.post.PostPowerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3969.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位工作权限主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 3 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | powername | 权限名称 | powername | varchar(200) | √ | 字符串 (String) |
| 6 | powermemo | 备注 | powermemo | varchar(1000) |  | 字符串 (String) |