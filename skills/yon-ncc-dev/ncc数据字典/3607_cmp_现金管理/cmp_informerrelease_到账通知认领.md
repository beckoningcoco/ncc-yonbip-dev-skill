# |<<

**到账通知认领 (cmp_informerrelease / nc.vo.cmp.informer.InformerReleaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_informerrelease | 主键 | pk_informerrelease | char(20) | √ | 主键 (UFID) |
| 2 | pk_informer | 到账通知主键 | pk_informer | varchar(20) |  | 到账通知 (informer) |
| 3 | release_org | 源发布组织 | release_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | releasedate | 发布日期 | releasedate | char(19) |  | 日期 (UFDate) |
| 5 | pk_org | 目标组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_releaser | 发布人 | pk_releaser | varchar(20) |  | 用户 (user) |
| 7 | direction | 收付性质 | direction | varchar(50) |  | 收付性质 (direction) |  | receivemoney=收款通知; |