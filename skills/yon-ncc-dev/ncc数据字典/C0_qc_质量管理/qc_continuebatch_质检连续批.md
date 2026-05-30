# |<<

**质检连续批 (qc_continuebatch / nc.vo.qc.continuebatch.entity.ContinueBatchHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_continuebatch | 质检连续批主键 | pk_continuebatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | fcontinuetype | 连续批类型 | fcontinuetype | int |  | 连续批类型 (continuetype) |  | 1=采购; |