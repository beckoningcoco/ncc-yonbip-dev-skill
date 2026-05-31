# |<<

**用户图像实体 (sm_userimage / nc.vo.platform.workbench.UserImageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5366.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userimage | 主键 | pk_userimage | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 用户主键 | cuserid | varchar(20) |  | 用户 (user) |
| 3 | image | 图像文件 | image | image |  | BLOB (BLOB) |
| 4 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 5 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |