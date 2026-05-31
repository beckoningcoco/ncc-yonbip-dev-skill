# |<<

**工序完工报告交易类型 (mm_opreptranstype / nc.vo.mmsfc.operationrep.entity.OprepTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3716.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prtranstype | 工序完工报告交易类型 | pk_prtranstype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 字符串 (String) |
| 4 | bautoapprove | 保存即审批 | bautoapprove | char(1) |  | 布尔类型 (UFBoolean) |